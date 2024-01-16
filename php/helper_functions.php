<?php

	// Returns a random element from an array
	function random_element($array)
	{
		return is_array($array) ? $array[array_rand($array)] : $array;
	}

	//Returns only the array items specified. Will return a default value if it is null (not set).
	function elements($items, array $array, $default = NULL)
	{
		$array = array();

		is_array($items) OR $items = array($items);

		foreach ($items as $item)
		{
			$array[$item] = array_key_exists($item, $array) ? $array[$item] : $default;
		}

		return $array;
	}

	//Formats a number as bytes, based on size, and adds the appropriate suffix
	function byte_format($number, $precision = 1)
	{
		if ($number >= 1000000000000)
		{
			$number = round($number / 1099511627776, $precision);
			$unit = "TB";
		}
		elseif ($number >= 1000000000)
		{
			$number = round($number / 1073741824, $precision);
			$unit = "GB";
		}
		elseif ($number >= 1000000)
		{
			$number = round($number / 1048576, $precision);
			$unit = "MB";
		}
		elseif ($number >= 1000)
		{
			$number = round($number / 1024, $precision);
			$unit = "KB";
		}
		else
		{
			$unit = "Bytes";
			return $number_format($number).' '.$unit;
		}

		return number_format($number, $precision).' '.$unit;
	}

	// Builds a string from an array without any separator
	function build_string ($arr) 
	{  
		echo implode($arr); 
	} 
	
	// Builds a string from an array with a separator '-'
	function build_string_with_separator ($arr) 
	{  
		echo implode("-",$arr); 
	} 



