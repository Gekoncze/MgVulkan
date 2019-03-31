#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceMultiviewProperties);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewProperties_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewProperties* o = (VkPhysicalDeviceMultiviewProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewProperties_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewProperties* o = (VkPhysicalDeviceMultiviewProperties*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewProperties_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewProperties* o = (VkPhysicalDeviceMultiviewProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewProperties_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewProperties* o = (VkPhysicalDeviceMultiviewProperties*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewProperties_getMaxMultiviewViewCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewProperties* o = (VkPhysicalDeviceMultiviewProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxMultiviewViewCount));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewProperties_setMaxMultiviewViewCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewProperties* o = (VkPhysicalDeviceMultiviewProperties*)jniLongToPointer(address);
    memcpy(&o->maxMultiviewViewCount, jniLongToPointer(valueAddress), sizeof(o->maxMultiviewViewCount));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewProperties_getMaxMultiviewInstanceIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewProperties* o = (VkPhysicalDeviceMultiviewProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxMultiviewInstanceIndex));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewProperties_setMaxMultiviewInstanceIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewProperties* o = (VkPhysicalDeviceMultiviewProperties*)jniLongToPointer(address);
    memcpy(&o->maxMultiviewInstanceIndex, jniLongToPointer(valueAddress), sizeof(o->maxMultiviewInstanceIndex));
}

