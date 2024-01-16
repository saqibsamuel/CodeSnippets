<?php
// This code find the difference between two dates using DateTime class
$start_date = new DateTime("1981-11-03");
$end_date = new DateTime("2013-09-04");
$interval = $start_date->diff($end_date);
echo "Difference : " . $interval->y . " years, " . $interval->m." months, ".$interval->d." days ";
?>
