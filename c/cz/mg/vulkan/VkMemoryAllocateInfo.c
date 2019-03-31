#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkMemoryAllocateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkMemoryAllocateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkMemoryAllocateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkMemoryAllocateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkMemoryAllocateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkMemoryAllocateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkMemoryAllocateInfo_getAllocationSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->allocationSize));
}

void Java_cz_mg_vulkan_vk_VkMemoryAllocateInfo_setAllocationSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    memcpy(&o->allocationSize, jniLongToPointer(valueAddress), sizeof(o->allocationSize));
}
jlong Java_cz_mg_vulkan_vk_VkMemoryAllocateInfo_getMemoryTypeIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->memoryTypeIndex));
}

void Java_cz_mg_vulkan_vk_VkMemoryAllocateInfo_setMemoryTypeIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    memcpy(&o->memoryTypeIndex, jniLongToPointer(valueAddress), sizeof(o->memoryTypeIndex));
}

