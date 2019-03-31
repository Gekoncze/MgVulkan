#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsTokenNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkIndirectCommandsTokenNVX);
}

jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsTokenNVX_getTokenType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsTokenNVX* o = (VkIndirectCommandsTokenNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->tokenType));
}

void Java_cz_mg_vulkan_vk_VkIndirectCommandsTokenNVX_setTokenType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsTokenNVX* o = (VkIndirectCommandsTokenNVX*)jniLongToPointer(address);
    memcpy(&o->tokenType, jniLongToPointer(valueAddress), sizeof(o->tokenType));
}
jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsTokenNVX_getBuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsTokenNVX* o = (VkIndirectCommandsTokenNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->buffer));
}

void Java_cz_mg_vulkan_vk_VkIndirectCommandsTokenNVX_setBuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsTokenNVX* o = (VkIndirectCommandsTokenNVX*)jniLongToPointer(address);
    memcpy(&o->buffer, jniLongToPointer(valueAddress), sizeof(o->buffer));
}
jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsTokenNVX_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsTokenNVX* o = (VkIndirectCommandsTokenNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->offset));
}

void Java_cz_mg_vulkan_vk_VkIndirectCommandsTokenNVX_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsTokenNVX* o = (VkIndirectCommandsTokenNVX*)jniLongToPointer(address);
    memcpy(&o->offset, jniLongToPointer(valueAddress), sizeof(o->offset));
}

