#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceProtectedMemoryFeatures_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceProtectedMemoryFeatures);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceProtectedMemoryFeatures_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProtectedMemoryFeatures* o = (VkPhysicalDeviceProtectedMemoryFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceProtectedMemoryFeatures_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProtectedMemoryFeatures* o = (VkPhysicalDeviceProtectedMemoryFeatures*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceProtectedMemoryFeatures_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProtectedMemoryFeatures* o = (VkPhysicalDeviceProtectedMemoryFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceProtectedMemoryFeatures_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProtectedMemoryFeatures* o = (VkPhysicalDeviceProtectedMemoryFeatures*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceProtectedMemoryFeatures_getProtectedMemory(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProtectedMemoryFeatures* o = (VkPhysicalDeviceProtectedMemoryFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->protectedMemory));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceProtectedMemoryFeatures_setProtectedMemory(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceProtectedMemoryFeatures* o = (VkPhysicalDeviceProtectedMemoryFeatures*)jniLongToPointer(address);
    memcpy(&o->protectedMemory, jniLongToPointer(valueAddress), sizeof(o->protectedMemory));
}

