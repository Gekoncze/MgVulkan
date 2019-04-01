#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkMappedMemoryRange_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkMappedMemoryRange);
}

jlong Java_cz_mg_vulkan_vk_VkMappedMemoryRange_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkMappedMemoryRange_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkMappedMemoryRange_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkMappedMemoryRange_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkMappedMemoryRange_getMemory(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    return jniPointerToLong(&o->memory);
}

void Java_cz_mg_vulkan_vk_VkMappedMemoryRange_setMemory(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memory, valuePointer, sizeof(o->memory));
}

jlong Java_cz_mg_vulkan_vk_VkMappedMemoryRange_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    return jniPointerToLong(&o->offset);
}

void Java_cz_mg_vulkan_vk_VkMappedMemoryRange_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->offset, valuePointer, sizeof(o->offset));
}

jlong Java_cz_mg_vulkan_vk_VkMappedMemoryRange_getSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    return jniPointerToLong(&o->size);
}

void Java_cz_mg_vulkan_vk_VkMappedMemoryRange_setSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->size, valuePointer, sizeof(o->size));
}


