#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
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
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_getStorageBuffer16BitAccess(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->storageBuffer16BitAccess);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_setStorageBuffer16BitAccess(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->storageBuffer16BitAccess, valuePointer, sizeof(o->storageBuffer16BitAccess));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_getUniformAndStorageBuffer16BitAccess(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->uniformAndStorageBuffer16BitAccess);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_setUniformAndStorageBuffer16BitAccess(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->uniformAndStorageBuffer16BitAccess, valuePointer, sizeof(o->uniformAndStorageBuffer16BitAccess));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_getStoragePushConstant16(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->storagePushConstant16);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_setStoragePushConstant16(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->storagePushConstant16, valuePointer, sizeof(o->storagePushConstant16));
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_getStorageInputOutput16(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->storageInputOutput16);
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevice16BitStorageFeatures_setStorageInputOutput16(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->storageInputOutput16, valuePointer, sizeof(o->storageInputOutput16));
}


