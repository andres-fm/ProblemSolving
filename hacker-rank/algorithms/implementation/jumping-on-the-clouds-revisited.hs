import Control.Applicative
import Control.Monad
import System.IO

energyLost :: [Int] -> Int -> Int -> Int -> Int -> Int
energyLost clouds pos i k n
                           | pos == 0 && i /= 0 = 0
                           | otherwise = if (clouds!!((pos+k)`mod`n)) == 0 
                                             then 1 + energyLost clouds ((pos+k)`mod`n) (i+1) k n
                                             else 3 + energyLost clouds ((pos+k)`mod`n) (i+1) k n

main :: IO ()
main = do
    n_temp <- getLine
    let n_t = words n_temp
        n = read $ n_t!!0 :: Int
        k = read $ n_t!!1 :: Int
    c_temp <- getLine
    let c = map read $ words c_temp :: [Int]
        energy = 100 - (energyLost c 0 0 k n)
    print energy
    
