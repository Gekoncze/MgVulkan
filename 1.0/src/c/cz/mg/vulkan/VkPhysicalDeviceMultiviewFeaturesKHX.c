#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeaturesKHX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceMultiviewFeaturesKHX);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeaturesKHX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeaturesKHX* o = (VkPhysicalDeviceMultiviewFeaturesKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeaturesKHX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeaturesKHX* o = (VkPhysicalDeviceMultiviewFeaturesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeaturesKHX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeaturesKHX* o = (VkPhysicalDeviceMultiviewFeaturesKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeaturesKHX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeaturesKHX* o = (VkPhysicalDeviceMultiviewFeaturesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeaturesKHX_getMultiview(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeaturesKHX* o = (VkPhysicalDeviceMultiviewFeaturesKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->multiview);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeaturesKHX_setMultiview(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeaturesKHX* o = (VkPhysicalDeviceMultiviewFeaturesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->multiview, valuePointer, sizeof(o->multiview));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeaturesKHX_getMultiviewGeometryShader(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeaturesKHX* o = (VkPhysicalDeviceMultiviewFeaturesKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->multiviewGeometryShader);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeaturesKHX_setMultiviewGeometryShader(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeaturesKHX* o = (VkPhysicalDeviceMultiviewFeaturesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->multiviewGeometryShader, valuePointer, sizeof(o->multiviewGeometryShader));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeaturesKHX_getMultiviewTessellationShader(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeaturesKHX* o = (VkPhysicalDeviceMultiviewFeaturesKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->multiviewTessellationShader);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewFeaturesKHX_setMultiviewTessellationShader(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeaturesKHX* o = (VkPhysicalDeviceMultiviewFeaturesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->multiviewTessellationShader, valuePointer, sizeof(o->multiviewTessellationShader));
}


