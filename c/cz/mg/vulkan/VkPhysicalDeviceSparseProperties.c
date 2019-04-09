#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceSparseProperties);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_getResidencyStandard2DBlockShape(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->residencyStandard2DBlockShape);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_setResidencyStandard2DBlockShape(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->residencyStandard2DBlockShape, valuePointer, sizeof(o->residencyStandard2DBlockShape));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_getResidencyStandard2DMultisampleBlockShape(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->residencyStandard2DMultisampleBlockShape);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_setResidencyStandard2DMultisampleBlockShape(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->residencyStandard2DMultisampleBlockShape, valuePointer, sizeof(o->residencyStandard2DMultisampleBlockShape));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_getResidencyStandard3DBlockShape(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->residencyStandard3DBlockShape);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_setResidencyStandard3DBlockShape(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->residencyStandard3DBlockShape, valuePointer, sizeof(o->residencyStandard3DBlockShape));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_getResidencyAlignedMipSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->residencyAlignedMipSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_setResidencyAlignedMipSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->residencyAlignedMipSize, valuePointer, sizeof(o->residencyAlignedMipSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_getResidencyNonResidentStrict(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->residencyNonResidentStrict);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_setResidencyNonResidentStrict(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->residencyNonResidentStrict, valuePointer, sizeof(o->residencyNonResidentStrict));
}


