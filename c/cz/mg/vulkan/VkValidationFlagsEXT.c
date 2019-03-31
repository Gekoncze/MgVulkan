#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkValidationFlagsEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkValidationFlagsEXT);
}

jlong Java_cz_mg_vulkan_vk_VkValidationFlagsEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkValidationFlagsEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkValidationFlagsEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkValidationFlagsEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkValidationFlagsEXT_getDisabledValidationCheckCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->disabledValidationCheckCount));
}

void Java_cz_mg_vulkan_vk_VkValidationFlagsEXT_setDisabledValidationCheckCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    memcpy(&o->disabledValidationCheckCount, jniLongToPointer(valueAddress), sizeof(o->disabledValidationCheckCount));
}
jlong Java_cz_mg_vulkan_vk_VkValidationFlagsEXT_getPDisabledValidationChecks(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pDisabledValidationChecks));
}

void Java_cz_mg_vulkan_vk_VkValidationFlagsEXT_setPDisabledValidationChecks(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkValidationFlagsEXT* o = (VkValidationFlagsEXT*)jniLongToPointer(address);
    memcpy(&o->pDisabledValidationChecks, jniLongToPointer(valueAddress), sizeof(o->pDisabledValidationChecks));
}

