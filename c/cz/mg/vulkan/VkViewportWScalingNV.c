#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkViewportWScalingNV_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkViewportWScalingNV);
}

jlong Java_cz_mg_vulkan_vk_VkViewportWScalingNV_getXcoeff(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewportWScalingNV* o = (VkViewportWScalingNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->xcoeff));
}

void Java_cz_mg_vulkan_vk_VkViewportWScalingNV_setXcoeff(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewportWScalingNV* o = (VkViewportWScalingNV*)jniLongToPointer(address);
    memcpy(&o->xcoeff, jniLongToPointer(valueAddress), sizeof(o->xcoeff));
}
jlong Java_cz_mg_vulkan_vk_VkViewportWScalingNV_getYcoeff(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewportWScalingNV* o = (VkViewportWScalingNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->ycoeff));
}

void Java_cz_mg_vulkan_vk_VkViewportWScalingNV_setYcoeff(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewportWScalingNV* o = (VkViewportWScalingNV*)jniLongToPointer(address);
    memcpy(&o->ycoeff, jniLongToPointer(valueAddress), sizeof(o->ycoeff));
}

