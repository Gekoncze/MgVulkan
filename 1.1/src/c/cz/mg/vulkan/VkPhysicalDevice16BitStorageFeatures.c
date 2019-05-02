#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDevice16BitStorageFeatures_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDevice16BitStorageFeatures);
}

void Java_cz_mg_vulkan_VkPhysicalDevice16BitStorageFeatures_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPhysicalDevice16BitStorageFeatures));
}

jlong Java_cz_mg_vulkan_VkPhysicalDevice16BitStorageFeatures_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDevice16BitStorageFeatures_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDevice16BitStorageFeatures_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDevice16BitStorageFeatures_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDevice16BitStorageFeatures_getStorageBuffer16BitAccessNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->storageBuffer16BitAccess);
}

void Java_cz_mg_vulkan_VkPhysicalDevice16BitStorageFeatures_setStorageBuffer16BitAccessNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->storageBuffer16BitAccess, valuePointer, sizeof(o->storageBuffer16BitAccess));
}

jlong Java_cz_mg_vulkan_VkPhysicalDevice16BitStorageFeatures_getUniformAndStorageBuffer16BitAccessNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->uniformAndStorageBuffer16BitAccess);
}

void Java_cz_mg_vulkan_VkPhysicalDevice16BitStorageFeatures_setUniformAndStorageBuffer16BitAccessNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->uniformAndStorageBuffer16BitAccess, valuePointer, sizeof(o->uniformAndStorageBuffer16BitAccess));
}

jlong Java_cz_mg_vulkan_VkPhysicalDevice16BitStorageFeatures_getStoragePushConstant16Native(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->storagePushConstant16);
}

void Java_cz_mg_vulkan_VkPhysicalDevice16BitStorageFeatures_setStoragePushConstant16Native(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->storagePushConstant16, valuePointer, sizeof(o->storagePushConstant16));
}

jlong Java_cz_mg_vulkan_VkPhysicalDevice16BitStorageFeatures_getStorageInputOutput16Native(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->storageInputOutput16);
}

void Java_cz_mg_vulkan_VkPhysicalDevice16BitStorageFeatures_setStorageInputOutput16Native(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevice16BitStorageFeatures* o = (VkPhysicalDevice16BitStorageFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->storageInputOutput16, valuePointer, sizeof(o->storageInputOutput16));
}


