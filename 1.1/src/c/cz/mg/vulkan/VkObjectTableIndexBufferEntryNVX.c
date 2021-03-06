#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkObjectTableIndexBufferEntryNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkObjectTableIndexBufferEntryNVX);
}

void Java_cz_mg_vulkan_VkObjectTableIndexBufferEntryNVX_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkObjectTableIndexBufferEntryNVX));
}

jlong Java_cz_mg_vulkan_VkObjectTableIndexBufferEntryNVX_getTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->type);
}

void Java_cz_mg_vulkan_VkObjectTableIndexBufferEntryNVX_setTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->type, valuePointer, sizeof(o->type));
}

jlong Java_cz_mg_vulkan_VkObjectTableIndexBufferEntryNVX_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkObjectTableIndexBufferEntryNVX_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkObjectTableIndexBufferEntryNVX_getBufferNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->buffer);
}

void Java_cz_mg_vulkan_VkObjectTableIndexBufferEntryNVX_setBufferNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->buffer, valuePointer, sizeof(o->buffer));
}

jlong Java_cz_mg_vulkan_VkObjectTableIndexBufferEntryNVX_getIndexTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->indexType);
}

void Java_cz_mg_vulkan_VkObjectTableIndexBufferEntryNVX_setIndexTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableIndexBufferEntryNVX* o = (VkObjectTableIndexBufferEntryNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->indexType, valuePointer, sizeof(o->indexType));
}


