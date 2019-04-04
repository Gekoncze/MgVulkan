package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkRenderPassSampleLocationsBeginInfoEXT.html">khronos documentation</a>
 **/
public class VulkanRenderPassSampleLocationsBeginInfoEXT extends VulkanObject {
    public VulkanRenderPassSampleLocationsBeginInfoEXT(){
        super(new VkRenderPassSampleLocationsBeginInfoEXT());
    }

    public VulkanRenderPassSampleLocationsBeginInfoEXT(VkRenderPassSampleLocationsBeginInfoEXT vk){
        super(vk);
    }

    @Override
    public VkRenderPassSampleLocationsBeginInfoEXT getVk(){
        return (VkRenderPassSampleLocationsBeginInfoEXT) super.getVk();
    }
    public VulkanRenderPassSampleLocationsBeginInfoEXT(VulkanObject pNext, VulkanUInt32 attachmentInitialSampleLocationsCount, VulkanAttachmentSampleLocationsEXT pAttachmentInitialSampleLocations, VulkanUInt32 postSubpassSampleLocationsCount, VulkanSubpassSampleLocationsEXT pPostSubpassSampleLocations) {
        super(new VkRenderPassSampleLocationsBeginInfoEXT(pNext.getVk(), attachmentInitialSampleLocationsCount.getVk(), pAttachmentInitialSampleLocations.getVk(), postSubpassSampleLocationsCount.getVk(), pPostSubpassSampleLocations.getVk()));
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

    public VulkanUInt32 getAttachmentInitialSampleLocationsCount() {
        return new VulkanUInt32(getVk().getAttachmentInitialSampleLocationsCount());
    }

    public void setAttachmentInitialSampleLocationsCount(VulkanUInt32 attachmentInitialSampleLocationsCount) {
        getVk().setAttachmentInitialSampleLocationsCount(attachmentInitialSampleLocationsCount.getVk());
    }

    public VulkanAttachmentSampleLocationsEXT getPAttachmentInitialSampleLocations() {
        return new VulkanAttachmentSampleLocationsEXT(getVk().getPAttachmentInitialSampleLocations());
    }

    public void setPAttachmentInitialSampleLocations(VulkanAttachmentSampleLocationsEXT pAttachmentInitialSampleLocations) {
        getVk().setPAttachmentInitialSampleLocations(pAttachmentInitialSampleLocations.getVk());
    }

    public VulkanUInt32 getPostSubpassSampleLocationsCount() {
        return new VulkanUInt32(getVk().getPostSubpassSampleLocationsCount());
    }

    public void setPostSubpassSampleLocationsCount(VulkanUInt32 postSubpassSampleLocationsCount) {
        getVk().setPostSubpassSampleLocationsCount(postSubpassSampleLocationsCount.getVk());
    }

    public VulkanSubpassSampleLocationsEXT getPPostSubpassSampleLocations() {
        return new VulkanSubpassSampleLocationsEXT(getVk().getPPostSubpassSampleLocations());
    }

    public void setPPostSubpassSampleLocations(VulkanSubpassSampleLocationsEXT pPostSubpassSampleLocations) {
        getVk().setPPostSubpassSampleLocations(pPostSubpassSampleLocations.getVk());
    }


    public static class Array extends VulkanRenderPassSampleLocationsBeginInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPassSampleLocationsBeginInfoEXT> {
        public Array(VkRenderPassSampleLocationsBeginInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkRenderPassSampleLocationsBeginInfoEXT.Array(count));
        }

        public Array(int count, VulkanRenderPassSampleLocationsBeginInfoEXT o){
            this(new VkRenderPassSampleLocationsBeginInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkRenderPassSampleLocationsBeginInfoEXT.Array getVk(){
            return (VkRenderPassSampleLocationsBeginInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanRenderPassSampleLocationsBeginInfoEXT get(int i){
            return new VulkanRenderPassSampleLocationsBeginInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkRenderPassSampleLocationsBeginInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkRenderPassSampleLocationsBeginInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkRenderPassSampleLocationsBeginInfoEXT.Pointer(value));
        }

        @Override
        public VkRenderPassSampleLocationsBeginInfoEXT.Pointer getVk(){
            return (VkRenderPassSampleLocationsBeginInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanRenderPassSampleLocationsBeginInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPassSampleLocationsBeginInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkRenderPassSampleLocationsBeginInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanRenderPassSampleLocationsBeginInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkRenderPassSampleLocationsBeginInfoEXT.Pointer.Array getVk(){
                return (VkRenderPassSampleLocationsBeginInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanRenderPassSampleLocationsBeginInfoEXT.Pointer get(int i){
                return new VulkanRenderPassSampleLocationsBeginInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
