#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
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
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkMappedMemoryRange_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkMappedMemoryRange_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkMappedMemoryRange_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkMappedMemoryRange_getMemory(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    return jniPointerToLong(&(o->memory));
}

void Java_cz_mg_vulkan_vk_VkMappedMemoryRange_setMemory(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    memcpy(&o->memory, jniLongToPointer(valueAddress), sizeof(o->memory));
}
jlong Java_cz_mg_vulkan_vk_VkMappedMemoryRange_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    return jniPointerToLong(&(o->offset));
}

void Java_cz_mg_vulkan_vk_VkMappedMemoryRange_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    memcpy(&o->offset, jniLongToPointer(valueAddress), sizeof(o->offset));
}
jlong Java_cz_mg_vulkan_vk_VkMappedMemoryRange_getSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    return jniPointerToLong(&(o->size));
}

void Java_cz_mg_vulkan_vk_VkMappedMemoryRange_setSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMappedMemoryRange* o = (VkMappedMemoryRange*)jniLongToPointer(address);
    memcpy(&o->size, jniLongToPointer(valueAddress), sizeof(o->size));
}

