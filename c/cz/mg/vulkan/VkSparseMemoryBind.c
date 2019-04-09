#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSparseMemoryBind_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSparseMemoryBind);
}

jlong Java_cz_mg_vulkan_VkSparseMemoryBind_getResourceOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseMemoryBind* o = (VkSparseMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&o->resourceOffset);
}

void Java_cz_mg_vulkan_VkSparseMemoryBind_setResourceOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseMemoryBind* o = (VkSparseMemoryBind*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->resourceOffset, valuePointer, sizeof(o->resourceOffset));
}

jlong Java_cz_mg_vulkan_VkSparseMemoryBind_getSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseMemoryBind* o = (VkSparseMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&o->size);
}

void Java_cz_mg_vulkan_VkSparseMemoryBind_setSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseMemoryBind* o = (VkSparseMemoryBind*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->size, valuePointer, sizeof(o->size));
}

jlong Java_cz_mg_vulkan_VkSparseMemoryBind_getMemory(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseMemoryBind* o = (VkSparseMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&o->memory);
}

void Java_cz_mg_vulkan_VkSparseMemoryBind_setMemory(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseMemoryBind* o = (VkSparseMemoryBind*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memory, valuePointer, sizeof(o->memory));
}

jlong Java_cz_mg_vulkan_VkSparseMemoryBind_getMemoryOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseMemoryBind* o = (VkSparseMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&o->memoryOffset);
}

void Java_cz_mg_vulkan_VkSparseMemoryBind_setMemoryOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseMemoryBind* o = (VkSparseMemoryBind*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memoryOffset, valuePointer, sizeof(o->memoryOffset));
}

jlong Java_cz_mg_vulkan_VkSparseMemoryBind_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseMemoryBind* o = (VkSparseMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkSparseMemoryBind_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseMemoryBind* o = (VkSparseMemoryBind*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}


