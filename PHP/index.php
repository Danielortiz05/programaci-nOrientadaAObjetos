<?php

require_once('Car.php');
require_once('Account.php');

$car = new Car("ABC123", new Account("Juan", "123.456.789-10"));
$car->PrintDataCar();