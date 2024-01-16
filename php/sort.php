<?php
// PHP class that sorts an ordered integer array with the help of sort() function.

class ArraySort
{
    protected $asort;
    
    public function __construct(array $asort)
     {
        $this->asort = $asort;
     }
    
     public function sortArray()
     {
        $arr = $this->asort;
        sort($arr);
        return $arr;
      }
}

$array = new ArraySort(array(1, -2, 4, 89, 0, 7, -9));
print_r($array->sortArray())."\n";
?>
