#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPresentRegionKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPresentRegionKHR);
}

jlong Java_cz_mg_vulkan_vk_VkPresentRegionKHR_getRectangleCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentRegionKHR* o = (VkPresentRegionKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->rectangleCount));
}

void Java_cz_mg_vulkan_vk_VkPresentRegionKHR_setRectangleCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentRegionKHR* o = (VkPresentRegionKHR*)jniLongToPointer(address);
    memcpy(&o->rectangleCount, jniLongToPointer(valueAddress), sizeof(o->rectangleCount));
}
jlong Java_cz_mg_vulkan_vk_VkPresentRegionKHR_getPRectangles(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentRegionKHR* o = (VkPresentRegionKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pRectangles));
}

void Java_cz_mg_vulkan_vk_VkPresentRegionKHR_setPRectangles(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentRegionKHR* o = (VkPresentRegionKHR*)jniLongToPointer(address);
    memcpy(&o->pRectangles, jniLongToPointer(valueAddress), sizeof(o->pRectangles));
}

