#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkSparseBufferMemoryBindInfo_getBuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseBufferMemoryBindInfo* o = (VkSparseBufferMemoryBindInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->buffer);
}

void Java_cz_mg_vulkan_VkSparseBufferMemoryBindInfo_setBuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseBufferMemoryBindInfo* o = (VkSparseBufferMemoryBindInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->buffer, valuePointer, sizeof(o->buffer));
}

jlong Java_cz_mg_vulkan_VkSparseBufferMemoryBindInfo_getBindCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseBufferMemoryBindInfo* o = (VkSparseBufferMemoryBindInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->bindCount);
}

void Java_cz_mg_vulkan_VkSparseBufferMemoryBindInfo_setBindCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseBufferMemoryBindInfo* o = (VkSparseBufferMemoryBindInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bindCount, valuePointer, sizeof(o->bindCount));
}

jlong Java_cz_mg_vulkan_VkSparseBufferMemoryBindInfo_getPBinds(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseBufferMemoryBindInfo* o = (VkSparseBufferMemoryBindInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pBinds);
}

void Java_cz_mg_vulkan_VkSparseBufferMemoryBindInfo_setPBinds(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseBufferMemoryBindInfo* o = (VkSparseBufferMemoryBindInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pBinds, &valuePointer, sizeof(o->pBinds));
}


