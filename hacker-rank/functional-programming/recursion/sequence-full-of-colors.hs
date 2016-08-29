fullOfColors :: String -> Bool
fullOfColors [] = True
fullOfColors x = red_green x && yellow_blue x && prefix_rg x 0 0 && prefix_yb x 0 0

red_green :: String -> Bool
red_green x = red x == green x

yellow_blue :: String -> Bool
yellow_blue x = yellow x == blue x

prefix_rg :: String -> Int -> Int -> Bool
prefix_rg [] r g = True
prefix_rg (x:xs) r g 
                    | x == 'R' = (abs ((r+1)-g) <= 1) && (prefix_rg xs (r+1) g)
                    | x == 'G' = (abs (r-(g+1)) <= 1) && (prefix_rg xs r (g+1))
                    | otherwise = prefix_rg xs r g

prefix_yb :: String -> Int -> Int -> Bool
prefix_yb [] y b = True
prefix_yb (x:xs) y b 
                    | x == 'Y' = (abs ((y+1)-b) <= 1) && (prefix_yb xs (y+1) b)
                    | x == 'B' = (abs (y-(b+1)) <= 1) && (prefix_yb xs y (b+1))
                    | otherwise = prefix_yb xs y b

red :: String -> Int
red [] = 0
red (x:xs) = if x == 'R' then 1 + red xs else 0 + red xs 

green :: String -> Int
green [] = 0
green (x:xs) = if x == 'G' then 1 + green xs else 0 + green xs 

yellow :: String -> Int
yellow [] = 0
yellow (x:xs) = if x == 'Y' then 1 + yellow xs else 0 + yellow xs 

blue :: String -> Int
blue [] = 0
blue (x:xs) = if x == 'B' then 1 + blue xs else 0 + blue xs 

testCases :: Int -> IO ()
testCases n
            | n <= 0 = putStr ""
            | otherwise = do 
                 x <- getLine
                 print (fullOfColors x)
                 testCases (n-1)

main :: IO ()
main = do t_temp <- getLine
          let t = read t_temp :: Int
          testCases t
          
