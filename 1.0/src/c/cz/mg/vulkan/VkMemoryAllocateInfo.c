#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkMemoryAllocateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkMemoryAllocateInfo);
}

jlong Java_cz_mg_vulkan_VkMemoryAllocateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkMemoryAllocateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkMemoryAllocateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkMemoryAllocateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkMemoryAllocateInfo_getAllocationSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->allocationSize);
}

void Java_cz_mg_vulkan_VkMemoryAllocateInfo_setAllocationSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->allocationSize, valuePointer, sizeof(o->allocationSize));
}

jlong Java_cz_mg_vulkan_VkMemoryAllocateInfo_getMemoryTypeIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->memoryTypeIndex);
}

void Java_cz_mg_vulkan_VkMemoryAllocateInfo_setMemoryTypeIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryAllocateInfo* o = (VkMemoryAllocateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memoryTypeIndex, valuePointer, sizeof(o->memoryTypeIndex));
}


