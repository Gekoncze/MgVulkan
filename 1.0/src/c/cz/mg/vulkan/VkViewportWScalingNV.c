#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkViewportWScalingNV_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkViewportWScalingNV);
}

void Java_cz_mg_vulkan_VkViewportWScalingNV_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkViewportWScalingNV));
}

jlong Java_cz_mg_vulkan_VkViewportWScalingNV_getXcoeffNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewportWScalingNV* o = (VkViewportWScalingNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->xcoeff);
}

void Java_cz_mg_vulkan_VkViewportWScalingNV_setXcoeffNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewportWScalingNV* o = (VkViewportWScalingNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->xcoeff, valuePointer, sizeof(o->xcoeff));
}

jlong Java_cz_mg_vulkan_VkViewportWScalingNV_getYcoeffNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewportWScalingNV* o = (VkViewportWScalingNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->ycoeff);
}

void Java_cz_mg_vulkan_VkViewportWScalingNV_setYcoeffNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewportWScalingNV* o = (VkViewportWScalingNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ycoeff, valuePointer, sizeof(o->ycoeff));
}


