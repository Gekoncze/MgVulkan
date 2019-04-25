#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeatures_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceMultiviewFeatures);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeatures_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeatures_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeatures_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeatures_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeatures_getMultiviewNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->multiview);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeatures_setMultiviewNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->multiview, valuePointer, sizeof(o->multiview));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeatures_getMultiviewGeometryShaderNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->multiviewGeometryShader);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeatures_setMultiviewGeometryShaderNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->multiviewGeometryShader, valuePointer, sizeof(o->multiviewGeometryShader));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeatures_getMultiviewTessellationShaderNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&o->multiviewTessellationShader);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeatures_setMultiviewTessellationShaderNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->multiviewTessellationShader, valuePointer, sizeof(o->multiviewTessellationShader));
}


