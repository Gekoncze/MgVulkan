#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDevice16BitStorageFeatures);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_getStorageBuffer16BitAccess(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->storageBuffer16BitAccess));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_setStorageBuffer16BitAccess(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    memcpy(&o->storageBuffer16BitAccess, jniLongToPointer(valueAddress), sizeof(o->storageBuffer16BitAccess));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_getUniformAndStorageBuffer16BitAccess(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->uniformAndStorageBuffer16BitAccess));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_setUniformAndStorageBuffer16BitAccess(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    memcpy(&o->uniformAndStorageBuffer16BitAccess, jniLongToPointer(valueAddress), sizeof(o->uniformAndStorageBuffer16BitAccess));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_getStoragePushConstant16(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->storagePushConstant16));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_setStoragePushConstant16(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    memcpy(&o->storagePushConstant16, jniLongToPointer(valueAddress), sizeof(o->storagePushConstant16));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_getStorageInputOutput16(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->storageInputOutput16));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_setStorageInputOutput16(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    memcpy(&o->storageInputOutput16, jniLongToPointer(valueAddress), sizeof(o->storageInputOutput16));
}

