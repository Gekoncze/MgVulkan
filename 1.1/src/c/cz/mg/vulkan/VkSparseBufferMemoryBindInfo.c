#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSparseBufferMemoryBindInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSparseBufferMemoryBindInfo);
}

jlong Java_cz_mg_vulkan_VkSparseBufferMemoryBindInfo_getBufferNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseBufferMemoryBindInfo* o = (VkSparseBufferMemoryBindInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->buffer);
}

void Java_cz_mg_vulkan_VkSparseBufferMemoryBindInfo_setBufferNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseBufferMemoryBindInfo* o = (VkSparseBufferMemoryBindInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->buffer, valuePointer, sizeof(o->buffer));
}

jlong Java_cz_mg_vulkan_VkSparseBufferMemoryBindInfo_getBindCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseBufferMemoryBindInfo* o = (VkSparseBufferMemoryBindInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->bindCount);
}

void Java_cz_mg_vulkan_VkSparseBufferMemoryBindInfo_setBindCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseBufferMemoryBindInfo* o = (VkSparseBufferMemoryBindInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bindCount, valuePointer, sizeof(o->bindCount));
}

jlong Java_cz_mg_vulkan_VkSparseBufferMemoryBindInfo_getPBindsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseBufferMemoryBindInfo* o = (VkSparseBufferMemoryBindInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pBinds);
}

void Java_cz_mg_vulkan_VkSparseBufferMemoryBindInfo_setPBindsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseBufferMemoryBindInfo* o = (VkSparseBufferMemoryBindInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pBinds, &valuePointer, sizeof(o->pBinds));
}


