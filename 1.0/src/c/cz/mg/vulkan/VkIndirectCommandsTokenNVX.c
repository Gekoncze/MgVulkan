#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkIndirectCommandsTokenNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkIndirectCommandsTokenNVX);
}

void Java_cz_mg_vulkan_VkIndirectCommandsTokenNVX_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkIndirectCommandsTokenNVX));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsTokenNVX_getTokenTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsTokenNVX* o = (VkIndirectCommandsTokenNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->tokenType);
}

void Java_cz_mg_vulkan_VkIndirectCommandsTokenNVX_setTokenTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsTokenNVX* o = (VkIndirectCommandsTokenNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tokenType, valuePointer, sizeof(o->tokenType));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsTokenNVX_getBufferNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsTokenNVX* o = (VkIndirectCommandsTokenNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->buffer);
}

void Java_cz_mg_vulkan_VkIndirectCommandsTokenNVX_setBufferNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsTokenNVX* o = (VkIndirectCommandsTokenNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->buffer, valuePointer, sizeof(o->buffer));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsTokenNVX_getOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsTokenNVX* o = (VkIndirectCommandsTokenNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->offset);
}

void Java_cz_mg_vulkan_VkIndirectCommandsTokenNVX_setOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsTokenNVX* o = (VkIndirectCommandsTokenNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->offset, valuePointer, sizeof(o->offset));
}


