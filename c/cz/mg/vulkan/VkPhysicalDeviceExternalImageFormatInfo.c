#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceExternalImageFormatInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceExternalImageFormatInfo);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceExternalImageFormatInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalImageFormatInfo* o = (VkPhysicalDeviceExternalImageFormatInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceExternalImageFormatInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalImageFormatInfo* o = (VkPhysicalDeviceExternalImageFormatInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceExternalImageFormatInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalImageFormatInfo* o = (VkPhysicalDeviceExternalImageFormatInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceExternalImageFormatInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalImageFormatInfo* o = (VkPhysicalDeviceExternalImageFormatInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceExternalImageFormatInfo_getHandleType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalImageFormatInfo* o = (VkPhysicalDeviceExternalImageFormatInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->handleType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceExternalImageFormatInfo_setHandleType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceExternalImageFormatInfo* o = (VkPhysicalDeviceExternalImageFormatInfo*)jniLongToPointer(address);
    memcpy(&o->handleType, jniLongToPointer(valueAddress), sizeof(o->handleType));
}

