#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2KHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSurfaceCapabilities2KHR);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2KHR_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkSurfaceCapabilities2KHR));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2KHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2KHR* o = (VkSurfaceCapabilities2KHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2KHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2KHR* o = (VkSurfaceCapabilities2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2KHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2KHR* o = (VkSurfaceCapabilities2KHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2KHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2KHR* o = (VkSurfaceCapabilities2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkSurfaceCapabilities2KHR_getSurfaceCapabilitiesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2KHR* o = (VkSurfaceCapabilities2KHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->surfaceCapabilities);
}

void Java_cz_mg_vulkan_VkSurfaceCapabilities2KHR_setSurfaceCapabilitiesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSurfaceCapabilities2KHR* o = (VkSurfaceCapabilities2KHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->surfaceCapabilities, valuePointer, sizeof(o->surfaceCapabilities));
}


