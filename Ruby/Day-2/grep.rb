regexpStr = ARGV.shift
filename = ARGV.shift

n = 1
IO.foreach(filename) do |line|
	regexp = Regexp.new(regexpStr)
	if regexp.match(line)
		puts "#{n}: #{line}"
		n += 1
	end
end