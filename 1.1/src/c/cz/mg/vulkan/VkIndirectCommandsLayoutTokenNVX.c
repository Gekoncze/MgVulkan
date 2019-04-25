#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutTokenNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkIndirectCommandsLayoutTokenNVX);
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutTokenNVX_getTokenTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->tokenType);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutTokenNVX_setTokenTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tokenType, valuePointer, sizeof(o->tokenType));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutTokenNVX_getBindingUnitNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->bindingUnit);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutTokenNVX_setBindingUnitNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bindingUnit, valuePointer, sizeof(o->bindingUnit));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutTokenNVX_getDynamicCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->dynamicCount);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutTokenNVX_setDynamicCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dynamicCount, valuePointer, sizeof(o->dynamicCount));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutTokenNVX_getDivisorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->divisor);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutTokenNVX_setDivisorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutTokenNVX* o = (VkIndirectCommandsLayoutTokenNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->divisor, valuePointer, sizeof(o->divisor));
}


