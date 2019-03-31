#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutCreateInfoNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkIndirectCommandsLayoutCreateInfoNVX);
}

jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutCreateInfoNVX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutCreateInfoNVX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutCreateInfoNVX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutCreateInfoNVX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutCreateInfoNVX_getPipelineBindPoint(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pipelineBindPoint));
}

void Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutCreateInfoNVX_setPipelineBindPoint(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->pipelineBindPoint, jniLongToPointer(valueAddress), sizeof(o->pipelineBindPoint));
}
jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutCreateInfoNVX_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutCreateInfoNVX_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutCreateInfoNVX_getTokenCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->tokenCount));
}

void Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutCreateInfoNVX_setTokenCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->tokenCount, jniLongToPointer(valueAddress), sizeof(o->tokenCount));
}
jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutCreateInfoNVX_getPTokens(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pTokens));
}

void Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutCreateInfoNVX_setPTokens(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    memcpy(&o->pTokens, jniLongToPointer(valueAddress), sizeof(o->pTokens));
}

