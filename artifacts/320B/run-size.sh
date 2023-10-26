#!/bin/bash
echo "Starting Expt"
rm -r out
size=$1

# -----------------------------------------------------Normal run----------------------------------------------------#
    echo "-----------------------------------Normal Run------------------------------------" >> out/out.log
    for i in 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
    do
        perf stat -e cycles,instructions,cache-misses,cache-references -d -d -d $DEV_JDK/java -Xverify:none -XX:ValueTypeFlatteningThreshold=100000 -XX:-EnableHCR -cp size-expt-$size.jar in.ac.iitmandi.compl.Main >> primitiveInstance.log 2>&1
    done
#
    echo "-----------------------------------------------------------------------" >> out/out.log
    echo "Completed Primitive Expt. Size: $size"
    echo "Completed Primitive Expt. Size: $size" >> out/out.log
#
    echo "-----------------------------------------------------------------------" >> out/out.log
    for i in 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
    do
        perf stat -e cycles,instructions,cache-misses,cache-references -d -d -d $DEV_JDK/java -Xverify:none -XX:ValueTypeFlatteningThreshold=0 -XX:-EnableHCR -cp size-expt-$size.jar in.ac.iitmandi.compl.Main >> nonprimitiveInstance.log 2>&1
    done
    echo "-----------------------------------------------------------------------" >> out/out.log
    echo "Completed Non-Primitive Expt. Size: $size"
    echo "Completed Non-Primitive Expt. Size: $size" >> out/out.log
echo "Finished Normal Expt" >> out/out.log
echo "-----------------------------------Normal Run End------------------------------------" >> out/out.log
# -----------------------------------------------------Normal run----------------------------------------------------#