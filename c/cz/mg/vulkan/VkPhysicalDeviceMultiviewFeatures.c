#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewFeatures_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceMultiviewFeatures);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewFeatures_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewFeatures_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewFeatures_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewFeatures_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewFeatures_getMultiview(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->multiview));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewFeatures_setMultiview(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    memcpy(&o->multiview, jniLongToPointer(valueAddress), sizeof(o->multiview));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewFeatures_getMultiviewGeometryShader(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->multiviewGeometryShader));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewFeatures_setMultiviewGeometryShader(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    memcpy(&o->multiviewGeometryShader, jniLongToPointer(valueAddress), sizeof(o->multiviewGeometryShader));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewFeatures_getMultiviewTessellationShader(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    return jniPointerToLong(&(o->multiviewTessellationShader));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceMultiviewFeatures_setMultiviewTessellationShader(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewFeatures* o = (VkPhysicalDeviceMultiviewFeatures*)jniLongToPointer(address);
    memcpy(&o->multiviewTessellationShader, jniLongToPointer(valueAddress), sizeof(o->multiviewTessellationShader));
}

