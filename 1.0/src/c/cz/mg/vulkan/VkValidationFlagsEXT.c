#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkValidationFlagsEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkValidationFlagsEXT);
}

jlong Java_cz_mg_vulkan_VkValidationFlagsEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkValidationFlagsEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkValidationFlagsEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkValidationFlagsEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkValidationFlagsEXT_getDisabledValidationCheckCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->disabledValidationCheckCount);
}

void Java_cz_mg_vulkan_VkValidationFlagsEXT_setDisabledValidationCheckCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->disabledValidationCheckCount, valuePointer, sizeof(o->disabledValidationCheckCount));
}

jlong Java_cz_mg_vulkan_VkValidationFlagsEXT_getPDisabledValidationChecksNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pDisabledValidationChecks);
}

void Java_cz_mg_vulkan_VkValidationFlagsEXT_setPDisabledValidationChecksNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDisabledValidationChecks, &valuePointer, sizeof(o->pDisabledValidationChecks));
}


