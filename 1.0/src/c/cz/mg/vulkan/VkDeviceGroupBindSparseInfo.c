#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDeviceGroupBindSparseInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGroupBindSparseInfo);
}

void Java_cz_mg_vulkan_VkDeviceGroupBindSparseInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDeviceGroupBindSparseInfo));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupBindSparseInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceGroupBindSparseInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupBindSparseInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceGroupBindSparseInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupBindSparseInfo_getResourceDeviceIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->resourceDeviceIndex);
}

void Java_cz_mg_vulkan_VkDeviceGroupBindSparseInfo_setResourceDeviceIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->resourceDeviceIndex, valuePointer, sizeof(o->resourceDeviceIndex));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupBindSparseInfo_getMemoryDeviceIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->memoryDeviceIndex);
}

void Java_cz_mg_vulkan_VkDeviceGroupBindSparseInfo_setMemoryDeviceIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memoryDeviceIndex, valuePointer, sizeof(o->memoryDeviceIndex));
}


