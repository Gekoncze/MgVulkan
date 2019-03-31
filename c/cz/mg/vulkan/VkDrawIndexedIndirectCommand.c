#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDrawIndexedIndirectCommand_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDrawIndexedIndirectCommand);
}

jlong Java_cz_mg_vulkan_vk_VkDrawIndexedIndirectCommand_getIndexCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&(o->indexCount));
}

void Java_cz_mg_vulkan_vk_VkDrawIndexedIndirectCommand_setIndexCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    memcpy(&o->indexCount, jniLongToPointer(valueAddress), sizeof(o->indexCount));
}
jlong Java_cz_mg_vulkan_vk_VkDrawIndexedIndirectCommand_getInstanceCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&(o->instanceCount));
}

void Java_cz_mg_vulkan_vk_VkDrawIndexedIndirectCommand_setInstanceCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    memcpy(&o->instanceCount, jniLongToPointer(valueAddress), sizeof(o->instanceCount));
}
jlong Java_cz_mg_vulkan_vk_VkDrawIndexedIndirectCommand_getFirstIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&(o->firstIndex));
}

void Java_cz_mg_vulkan_vk_VkDrawIndexedIndirectCommand_setFirstIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    memcpy(&o->firstIndex, jniLongToPointer(valueAddress), sizeof(o->firstIndex));
}
jlong Java_cz_mg_vulkan_vk_VkDrawIndexedIndirectCommand_getVertexOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&(o->vertexOffset));
}

void Java_cz_mg_vulkan_vk_VkDrawIndexedIndirectCommand_setVertexOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    memcpy(&o->vertexOffset, jniLongToPointer(valueAddress), sizeof(o->vertexOffset));
}
jlong Java_cz_mg_vulkan_vk_VkDrawIndexedIndirectCommand_getFirstInstance(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&(o->firstInstance));
}

void Java_cz_mg_vulkan_vk_VkDrawIndexedIndirectCommand_setFirstInstance(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    memcpy(&o->firstInstance, jniLongToPointer(valueAddress), sizeof(o->firstInstance));
}

