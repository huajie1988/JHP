<?php
namespace com\huajie\app\controller;

import com\huajie\app\service\UserService;
import com\huajie\app\domain\User;
import org\springframework\beans\factory\annotation\Autowired;
import org\springframework\web\bind\annotation\*;
import java\util\List;

#[JavaDoc(@RestController)]
#[JavaDoc(@RequestMapping("/user"))]
class UserController {

    #[JavaDoc(@Autowired)]
    private UserService $userService;

    #[JavaDoc(@GetMapping('/{id}'))]
    public function getById(#[JavaDoc(@PathVariable("id"))] int $id): User {
        return $userService->getById($id);
    }

    #[JavaDoc(@GetMapping("/list"))]
    public function listAll(): List<: User :> {
        return $userService->list();
    }

    #[JavaDoc(@PostMapping("/save"))]
    public function save(#[JavaDoc(@RequestBody)] User $user): bool {
        return $userService->save($user);
    }

    #[JavaDoc(@PutMapping("/update"))]
    public function update(#[JavaDoc(@RequestBody)] User $user): bool {
        return $userService->updateById($user);
    }

    #[JavaDoc(@DeleteMapping('/{id}'))]
    public function delete(#[JavaDoc(@PathVariable("id"))] int $id): bool {
        return $userService->removeById($id);
    }

    /**
     * 跨文件类型推断测试：调用 UserService.getByEmail 后，
     * 编译器能通过全局符号表推断 $user 为 User 类型，而非 Object。
     */
    #[JavaDoc(@GetMapping('/email/{email}'))]
    public function getByEmail(#[JavaDoc(@PathVariable("email"))] string $email): User {
        $user = $userService->getByEmail($email);
        // 如果类型推断失败，$user 为 Object，下面的输出语句将无法编译
        echo "用户姓名: ", $user->name, "\n";
        return $user;
    }

    /**
     * 跨文件泛型推断测试：调用 Service 方法后包装为 Result<User>，
     * 编译器能推断 Result.getData() 返回 User。
     */
    #[JavaDoc(@GetMapping('/result/{id}'))]
    public function getUserResult(#[JavaDoc(@PathVariable("id"))] int $id): Result<:User:> {
        $user = $userService->getById($id);
        $user2 = new User();
        $result = new Result<:User:>();
        $result->code = 200;
        $result->msg = "success";
        $result->data = $user;
        // 泛型推断：$result->getData() 返回 User
        echo "姓名: ", $result->getData()->name, "\n";
        return $result;
    }
}