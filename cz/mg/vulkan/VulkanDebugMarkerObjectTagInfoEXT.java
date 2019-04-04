package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugMarkerObjectTagInfoEXT.html">khronos documentation</a>
 **/
public class VulkanDebugMarkerObjectTagInfoEXT extends VulkanObject {
    public VulkanDebugMarkerObjectTagInfoEXT(){
        super(new VkDebugMarkerObjectTagInfoEXT());
    }

    public VulkanDebugMarkerObjectTagInfoEXT(VkDebugMarkerObjectTagInfoEXT vk){
        super(vk);
    }

    @Override
    public VkDebugMarkerObjectTagInfoEXT getVk(){
        return (VkDebugMarkerObjectTagInfoEXT) super.getVk();
    }
    public VulkanDebugMarkerObjectTagInfoEXT(VulkanObject pNext, VulkanDebugReportObjectTypeEXT objectType, VulkanUInt64 object, VulkanUInt64 tagName, VulkanSize tagSize, VulkanObject pTag) {
        super(new VkDebugMarkerObjectTagInfoEXT(pNext.getVk(), objectType.getVk(), object.getVk(), tagName.getVk(), tagSize.getVk(), pTag.getVk()));
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

    public VulkanDebugReportObjectTypeEXT getObjectType() {
        return new VulkanDebugReportObjectTypeEXT(getVk().getObjectType());
    }

    public void setObjectType(VulkanDebugReportObjectTypeEXT objectType) {
        getVk().setObjectType(objectType.getVk());
    }

    public VulkanUInt64 getObject() {
        return new VulkanUInt64(getVk().getObject());
    }

    public void setObject(VulkanUInt64 object) {
        getVk().setObject(object.getVk());
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


    public static class Array extends VulkanDebugMarkerObjectTagInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugMarkerObjectTagInfoEXT> {
        public Array(VkDebugMarkerObjectTagInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugMarkerObjectTagInfoEXT.Array(count));
        }

        public Array(int count, VulkanDebugMarkerObjectTagInfoEXT o){
            this(new VkDebugMarkerObjectTagInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugMarkerObjectTagInfoEXT.Array getVk(){
            return (VkDebugMarkerObjectTagInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugMarkerObjectTagInfoEXT get(int i){
            return new VulkanDebugMarkerObjectTagInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugMarkerObjectTagInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugMarkerObjectTagInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugMarkerObjectTagInfoEXT.Pointer(value));
        }

        @Override
        public VkDebugMarkerObjectTagInfoEXT.Pointer getVk(){
            return (VkDebugMarkerObjectTagInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugMarkerObjectTagInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugMarkerObjectTagInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugMarkerObjectTagInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugMarkerObjectTagInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugMarkerObjectTagInfoEXT.Pointer.Array getVk(){
                return (VkDebugMarkerObjectTagInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugMarkerObjectTagInfoEXT.Pointer get(int i){
                return new VulkanDebugMarkerObjectTagInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
