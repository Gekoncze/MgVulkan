#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupBindSparseInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGroupBindSparseInfo);
}

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupBindSparseInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupBindSparseInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceGroupBindSparseInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupBindSparseInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceGroupBindSparseInfo_getResourceDeviceIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->resourceDeviceIndex));
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupBindSparseInfo_setResourceDeviceIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    memcpy(&o->resourceDeviceIndex, jniLongToPointer(valueAddress), sizeof(o->resourceDeviceIndex));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceGroupBindSparseInfo_getMemoryDeviceIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->memoryDeviceIndex));
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupBindSparseInfo_setMemoryDeviceIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupBindSparseInfo* o = (VkDeviceGroupBindSparseInfo*)jniLongToPointer(address);
    memcpy(&o->memoryDeviceIndex, jniLongToPointer(valueAddress), sizeof(o->memoryDeviceIndex));
}

