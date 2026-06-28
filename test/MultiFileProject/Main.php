<?php
// 主类：调用其他类的方法
use models\User;
use services\UserService;
use utils\StringHelper;

class Main {
    public function main(): void {
        echo "=== Multi-file Project Demo ===\n";

        $service = new UserService();

        $user1 = new User("Alice", 25);
        $user2 = new User("Bob", 30);

        $service->addUser($user1);
        $service->addUser($user2);

        echo "User count: " . strval($service->count()) . "\n";

        $users = $service->getUsers();
        foreach ($users as $user) {
            echo $user->getInfo() . "\n";
        }

        $template = "Hello, {name}!";
        $greeting = StringHelper::format($template, "World");
        echo $greeting . "\n";
    }
}
