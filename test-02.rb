x = 10

(1..x).each do |i|
  puts ("0" * (x - i)) + ("X" * i)
end

