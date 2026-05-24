<?php
enum EnumTest : int, string (code, message) {
    case NOT_PAID = (0, "未支付");
    case PAID = (1, "已支付");


    public static function getMessage(int $code):string {
        #[Type(List<: EnumTest :>)]
        $list = List::of(EnumTest::values());
        foreach ($list as $os ) {
            if ($os->getCode() == $code) {
                return $os->message;
            }
        }
        return null;
    }

}