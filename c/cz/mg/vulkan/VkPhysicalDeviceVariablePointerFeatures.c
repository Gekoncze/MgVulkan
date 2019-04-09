#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeatures_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceVariablePointerFeatures);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeatures_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeatures* o = (VkPhysicalDeviceVariablePointerFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeatures_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeatures* o = (VkPhysicalDeviceVariablePointerFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeatures_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeatures* o = (VkPhysicalDeviceVariablePointerFeatures*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeatures_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeatures* o = (VkPhysicalDeviceVariablePointerFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeatures_getVariablePointersStorageBuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeatures* o = (VkPhysicalDeviceVariablePointerFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->variablePointersStorageBuffer);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeatures_setVariablePointersStorageBuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeatures* o = (VkPhysicalDeviceVariablePointerFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->variablePointersStorageBuffer, valuePointer, sizeof(o->variablePointersStorageBuffer));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeatures_getVariablePointers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeatures* o = (VkPhysicalDeviceVariablePointerFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->variablePointers);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceVariablePointerFeatures_setVariablePointers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceVariablePointerFeatures* o = (VkPhysicalDeviceVariablePointerFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->variablePointers, valuePointer, sizeof(o->variablePointers));
}


