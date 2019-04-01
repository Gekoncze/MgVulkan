#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutTokenNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkIndirectCommandsLayoutTokenNVX);
}

jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutTokenNVX_getTokenType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->tokenType);
}

void Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutTokenNVX_setTokenType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tokenType, valuePointer, sizeof(o->tokenType));
}

jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutTokenNVX_getBindingUnit(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->bindingUnit);
}

void Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutTokenNVX_setBindingUnit(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bindingUnit, valuePointer, sizeof(o->bindingUnit));
}

jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutTokenNVX_getDynamicCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->dynamicCount);
}

void Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutTokenNVX_setDynamicCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dynamicCount, valuePointer, sizeof(o->dynamicCount));
}

jlong Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutTokenNVX_getDivisor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->divisor);
}

void Java_cz_mg_vulkan_vk_VkIndirectCommandsLayoutTokenNVX_setDivisor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->divisor, valuePointer, sizeof(o->divisor));
}


