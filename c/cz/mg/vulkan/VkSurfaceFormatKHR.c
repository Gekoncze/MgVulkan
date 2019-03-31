#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSurfaceFormatKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSurfaceFormatKHR);
}

jlong Java_cz_mg_vulkan_vk_VkSurfaceFormatKHR_getFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceFormatKHR* o = (VkSurfaceFormatKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->format));
}

void Java_cz_mg_vulkan_vk_VkSurfaceFormatKHR_setFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceFormatKHR* o = (VkSurfaceFormatKHR*)jniLongToPointer(address);
    memcpy(&o->format, jniLongToPointer(valueAddress), sizeof(o->format));
}
jlong Java_cz_mg_vulkan_vk_VkSurfaceFormatKHR_getColorSpace(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceFormatKHR* o = (VkSurfaceFormatKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->colorSpace));
}

void Java_cz_mg_vulkan_vk_VkSurfaceFormatKHR_setColorSpace(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceFormatKHR* o = (VkSurfaceFormatKHR*)jniLongToPointer(address);
    memcpy(&o->colorSpace, jniLongToPointer(valueAddress), sizeof(o->colorSpace));
}

