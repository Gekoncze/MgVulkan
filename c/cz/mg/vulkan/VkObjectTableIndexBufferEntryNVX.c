#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkObjectTableIndexBufferEntryNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkObjectTableIndexBufferEntryNVX);
}

jlong Java_cz_mg_vulkan_vk_VkObjectTableIndexBufferEntryNVX_getType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->type);
}

void Java_cz_mg_vulkan_vk_VkObjectTableIndexBufferEntryNVX_setType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->type, valuePointer, sizeof(o->type));
}

jlong Java_cz_mg_vulkan_vk_VkObjectTableIndexBufferEntryNVX_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_vk_VkObjectTableIndexBufferEntryNVX_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_vk_VkObjectTableIndexBufferEntryNVX_getBuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->buffer);
}

void Java_cz_mg_vulkan_vk_VkObjectTableIndexBufferEntryNVX_setBuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->buffer, valuePointer, sizeof(o->buffer));
}

jlong Java_cz_mg_vulkan_vk_VkObjectTableIndexBufferEntryNVX_getIndexType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->indexType);
}

void Java_cz_mg_vulkan_vk_VkObjectTableIndexBufferEntryNVX_setIndexType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->indexType, valuePointer, sizeof(o->indexType));
}


