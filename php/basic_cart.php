<?php
// This class implements basic properties and methods for a shopping cart.

class ShoppingCart {
    
    private $items;
    private $total;

    // Constructor
    public function __construct() {
        $this->items = [];
        $this->total = 0;
    }

    public function addItem($item, $price) {
        $this->items[$item] = $price;
        $this->total += $price;
    }

    public function getTotal() {
        return $this->total;
    }
}

$cart = new ShoppingCart();

$cart->addItem("Apples", 5);
$cart->addItem("Bananas", 2);
$cart->addItem("Oranges", 8);

$total = $cart->getTotal();
echo "Total : $" . $total;

?>
