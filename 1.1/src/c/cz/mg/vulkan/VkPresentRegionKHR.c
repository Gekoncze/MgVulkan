#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPresentRegionKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPresentRegionKHR);
}

void Java_cz_mg_vulkan_VkPresentRegionKHR_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPresentRegionKHR));
}

jlong Java_cz_mg_vulkan_VkPresentRegionKHR_getRectangleCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentRegionKHR* o = (VkPresentRegionKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->rectangleCount);
}

void Java_cz_mg_vulkan_VkPresentRegionKHR_setRectangleCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentRegionKHR* o = (VkPresentRegionKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->rectangleCount, valuePointer, sizeof(o->rectangleCount));
}

jlong Java_cz_mg_vulkan_VkPresentRegionKHR_getPRectanglesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentRegionKHR* o = (VkPresentRegionKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pRectangles);
}

void Java_cz_mg_vulkan_VkPresentRegionKHR_setPRectanglesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentRegionKHR* o = (VkPresentRegionKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pRectangles, &valuePointer, sizeof(o->pRectangles));
}


