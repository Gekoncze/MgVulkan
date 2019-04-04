package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsObjectTagInfoEXT.html">khronos documentation</a>
 **/
public class VulkanDebugUtilsObjectTagInfoEXT extends VulkanObject {
    public VulkanDebugUtilsObjectTagInfoEXT(){
        super(new VkDebugUtilsObjectTagInfoEXT());
    }

    public VulkanDebugUtilsObjectTagInfoEXT(VkDebugUtilsObjectTagInfoEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsObjectTagInfoEXT getVk(){
        return (VkDebugUtilsObjectTagInfoEXT) super.getVk();
    }
    public VulkanDebugUtilsObjectTagInfoEXT(VulkanObject pNext, VulkanObjectType objectType, VulkanUInt64 objectHandle, VulkanUInt64 tagName, VulkanSize tagSize, VulkanObject pTag) {
        super(new VkDebugUtilsObjectTagInfoEXT(pNext.getVk(), objectType.getVk(), objectHandle.getVk(), tagName.getVk(), tagSize.getVk(), pTag.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanObjectType getObjectType() {
        return new VulkanObjectType(getVk().getObjectType());
    }

    public void setObjectType(VulkanObjectType objectType) {
        getVk().setObjectType(objectType.getVk());
    }

    public VulkanUInt64 getObjectHandle() {
        return new VulkanUInt64(getVk().getObjectHandle());
    }

    public void setObjectHandle(VulkanUInt64 objectHandle) {
        getVk().setObjectHandle(objectHandle.getVk());
    }

    public VulkanUInt64 getTagName() {
        return new VulkanUInt64(getVk().getTagName());
    }

    public void setTagName(VulkanUInt64 tagName) {
        getVk().setTagName(tagName.getVk());
    }

    public VulkanSize getTagSize() {
        return new VulkanSize(getVk().getTagSize());
    }

    public void setTagSize(VulkanSize tagSize) {
        getVk().setTagSize(tagSize.getVk());
    }

    public VulkanObject getPTag() {
        return new VulkanObject(getVk().getPTag());
    }

    public void setPTag(VulkanObject pTag) {
        getVk().setPTag(pTag.getVk());
    }


    public static class Array extends VulkanDebugUtilsObjectTagInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsObjectTagInfoEXT> {
        public Array(VkDebugUtilsObjectTagInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugUtilsObjectTagInfoEXT.Array(count));
        }

        public Array(int count, VulkanDebugUtilsObjectTagInfoEXT o){
            this(new VkDebugUtilsObjectTagInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugUtilsObjectTagInfoEXT.Array getVk(){
            return (VkDebugUtilsObjectTagInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugUtilsObjectTagInfoEXT get(int i){
            return new VulkanDebugUtilsObjectTagInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugUtilsObjectTagInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugUtilsObjectTagInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugUtilsObjectTagInfoEXT.Pointer(value));
        }

        @Override
        public VkDebugUtilsObjectTagInfoEXT.Pointer getVk(){
            return (VkDebugUtilsObjectTagInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugUtilsObjectTagInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsObjectTagInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugUtilsObjectTagInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugUtilsObjectTagInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugUtilsObjectTagInfoEXT.Pointer.Array getVk(){
                return (VkDebugUtilsObjectTagInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugUtilsObjectTagInfoEXT.Pointer get(int i){
                return new VulkanDebugUtilsObjectTagInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
