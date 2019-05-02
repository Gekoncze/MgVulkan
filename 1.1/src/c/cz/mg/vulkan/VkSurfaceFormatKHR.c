#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSurfaceFormatKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSurfaceFormatKHR);
}

void Java_cz_mg_vulkan_VkSurfaceFormatKHR_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkSurfaceFormatKHR));
}

jlong Java_cz_mg_vulkan_VkSurfaceFormatKHR_getFormatNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceFormatKHR* o = (VkSurfaceFormatKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->format);
}

void Java_cz_mg_vulkan_VkSurfaceFormatKHR_setFormatNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceFormatKHR* o = (VkSurfaceFormatKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->format, valuePointer, sizeof(o->format));
}

jlong Java_cz_mg_vulkan_VkSurfaceFormatKHR_getColorSpaceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceFormatKHR* o = (VkSurfaceFormatKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->colorSpace);
}

void Java_cz_mg_vulkan_VkSurfaceFormatKHR_setColorSpaceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceFormatKHR* o = (VkSurfaceFormatKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->colorSpace, valuePointer, sizeof(o->colorSpace));
}


