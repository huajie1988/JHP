<?php
// 服务类：用户服务
namespace services;

use models\User;

class UserService {
    private array $users;

    public function __construct() {
        $this->users = [];
    }

    public function addUser(User $user): void {
        $this->users[] = $user;
    }

    public function getUsers(): array {
        return $this->users;
    }

    public function count(): int {
        return count($this->users);
    }
}
