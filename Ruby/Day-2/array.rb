a = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]
puts "there are #{a.size} items in the array: #{a}"
a.each { |e| puts e }
a.each do |e|
	puts e
	#unsure how I would be able to print four at a time, here
end