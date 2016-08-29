import Text.Printf (printf)

solve :: Int -> Int -> [Int] -> [Int] -> [Double]
solve l r a b = [area (fromIntegral l) (fromIntegral r) a b, volume (fromIntegral l) (fromIntegral r) a b]

volume :: Double -> Double -> [Int] -> [Int] -> Double
volume l r a b = sum[pi*(f a b i)**2*0.001 | i <- [l, l+0.001..r], i <= r]

area :: Double -> Double -> [Int] -> [Int] -> Double
area l r a b = sum[((f a b i)*0.001) | i <- [l, l+0.001..r], i <= r] 

f :: [Int] -> [Int] -> Double -> Double
f a b x = sum[fromIntegral (a!!i) * x ** fromIntegral (b!!i) | i <- [0..(length a)-1]]

main :: IO ()
main = getContents >>= mapM_ (printf "%.1f\n"). (\[a, b, [l, r]] -> solve l r a b). map (map read. words). lines
